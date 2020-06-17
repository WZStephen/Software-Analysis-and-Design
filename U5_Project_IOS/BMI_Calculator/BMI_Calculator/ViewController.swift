//
//  ViewController.swift
//  BMI_Calculator
//
//  Created by Weichi Zhao on 6/16/20.
//  Copyright © 2020 Weichi Zhao. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
    }
    @IBOutlet weak var height: UITextField!
    @IBOutlet weak var weight: UITextField!
    @IBOutlet weak var bmi_label: UILabel!
    @IBOutlet weak var message: UILabel!
    @IBAction func calc_btn(_ sender: Any) {
        if(height.text != "" && weight.text != ""){
            let bmiModel: calcModel = calcModel()
            let h = Double(height.text!)
            let w = Double(weight.text!)
            let bmiValue:Double = bmiModel.bmiCalculator(height: h!, weight: w!)
            bmi_label.text = String(format: "%.2f", bmiValue)
            bmi_label.textAlignment = .center
            
            let bmiRespnse:String = bmiModel.message(bmi: bmiValue)
            message.text = "You are " + bmiRespnse
            message.textAlignment = .center
            if(bmiRespnse == "underweight"){
                message.textColor = .blue
            } else if(bmiRespnse == "normal"){
                message.textColor = .green
            } else if(bmiRespnse == "pre-obese"){
                message.textColor = .purple
            } else if(bmiRespnse == "obese"){
                message.textColor = .red
            }
        } else{
            bmi_label.text = "Label"
            message.text = "INVALID INPUT"
            message.textAlignment = .center
            message.textColor = .red
        }
    }
}

