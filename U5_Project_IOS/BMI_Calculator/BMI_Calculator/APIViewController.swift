//
//  APIController.swift
//  BMI_Calculator
//
//  Created by Weichi Zhao on 6/16/20.
//  Copyright © 2020 Weichi Zhao. All rights reserved.
//

import Foundation
import UIKit

class APIViewController:UIViewController{
    
    var more = [String]()

    override func viewDidLoad() {
        super.viewDidLoad()
    }
    @IBAction func dismissTapped(_ sender: Any) {
        dismiss(animated: true, completion: nil)
    }
    @IBOutlet weak var height: UITextField!
    @IBOutlet weak var weight: UITextField!
    @IBOutlet weak var message: UILabel!
    @IBOutlet weak var bmi_label: UILabel!
    
    struct API_Response: Decodable {
        let bmi: Double
        let more: [String]
        let risk: String
    }

    @IBAction func callApi_btn(_ sender: Any) {
        
        
        if(height.text != "" && weight.text != ""){
            //read user input text
            let height_text = height.text!
            let weight_text = weight.text!
            let urlAsString = "http://webstrar99.fulton.asu.edu/page3/Service1.svc/calculateBMI?height=\(height_text)&weight=\(weight_text)"
            
            //make request
            let url = URL(string: urlAsString)
            let urlSession = URLSession.shared
            let jsonQuery = urlSession.dataTask(with: url!) { (data, response, error) -> Void in
                let decoder = JSONDecoder()
                let jsonResult = try! decoder.decode(API_Response.self, from: data!)
                let bmiValue = jsonResult.bmi
                self.more = jsonResult.more
                let risk = jsonResult.risk
                
                DispatchQueue.main.async {
                    self.bmi_label.text = String(format: "%.2f",bmiValue)
                    self.message.text = risk
                    self.message.textAlignment = .center
                    if (bmiValue < 18) {
                        self.message.textColor = .blue
                    }
                    else if (bmiValue >= 18 && bmiValue < 25) {
                        self.message.textColor = .green
                    }
                    else if (bmiValue >= 25 && bmiValue <= 30) {
                        self.message.textColor = .purple
                    }
                    else if (bmiValue > 30) {
                        self.message.textColor = .red
                    }
                }
            }
            jsonQuery.resume()
        }else{
            bmi_label.text = "Label"
            message.text = "INVALID INPUT"
            message.textAlignment = .center
            message.textColor = .red
        }
    }
    
    //pass the url to educate page to display the website
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if segue.destination is EducateViewController {
            let vc = segue.destination as! EducateViewController
            vc.urls = more
        }
    }
}

