//
//  EducateViewController.swift
//  BMI_Calculator
//
//  Created by Weichi Zhao on 6/16/20.
//  Copyright © 2020 Weichi Zhao. All rights reserved.
//

import Foundation
import UIKit
import WebKit

class EducateViewController:UIViewController, WKUIDelegate{
    var webView: WKWebView!
    var urls = [String]()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let myURL = URL(string: urls[Int.random(in: 0..<3)])
        let request = URLRequest (url: myURL!)
        webView.load(request)
    }
    
    override func loadView() {
        let webConfiguration = WKWebViewConfiguration()
        webView = WKWebView(frame: .zero, configuration: webConfiguration)
        webView.uiDelegate = self
        view = webView
    }


}
