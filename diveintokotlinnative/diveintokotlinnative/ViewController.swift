//
//  ViewController.swift
//  diveintokotlinnative
//
//  Created by Satoshi Takeda on 2018/11/16.
//  Copyright © 2018年 satsukies. All rights reserved.
//

import UIKit
import ShareCode

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(24)
        // 共通モジュールに実装したfunctionが呼び出せている
        label.text = CommonKt.createApplicationScreenMessage()
        view.addSubview(label)
    }
}

