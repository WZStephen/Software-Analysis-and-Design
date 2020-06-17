//
//  calcModel.swift
//  BMI_Calculator
//
//  Created by Weichi Zhao on 6/16/20.
//  Copyright © 2020 Weichi Zhao. All rights reserved.
//

import Foundation
class calcModel{
    func bmiCalculator(height:Double, weight:Double)->Double {
        let response:Double = (weight/(height*height))*703
        return response
    }
    
    func message(bmi: Double)->String {
        if (bmi < 18) {
            return "underweight"
        }
        else if (bmi >= 18 && bmi < 25) {
            return "normal"
        }
        else if (bmi >= 25 && bmi <= 30) {
            return "pre-obese"
        }
        else if (bmi > 30) {
            return "obese"
        }
        else {
            return "Invalid entry"
        
        }
    }
}
