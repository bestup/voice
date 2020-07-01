package com.voice.controller;

import com.voice.invoker.JacobVoiceInvoker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author halo.l
 * @date 2020/7/1
 */
@RestController
public class InvoiceController {

    @GetMapping("/invoice")
    public String check() {
        JacobVoiceInvoker.textToSpeech("微信收款10元");
        return "success";
    }

}
