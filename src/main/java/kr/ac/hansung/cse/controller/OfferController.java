package kr.ac.hansung.cse.controller;

import kr.ac.hansung.cse.model.Offer;
import kr.ac.hansung.cse.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller //bean으로 등록 됨. 스프링 컨테이너에 객체로 등록 됨.
public class OfferController {

    @Autowired //의존성 주입. OfferService타입의 bean존재 시 의존성 주입 하라!
    private OfferService offerService;

    @GetMapping("/offers")
    public String showOffers(Model model) {
        List<Offer> offers = offerService.getAllOffers(); //모든 offer 가져옴.
        model.addAttribute("id_offers", offers); //model에 저장.

        return "offers"; //view이름:offers
    }
}
