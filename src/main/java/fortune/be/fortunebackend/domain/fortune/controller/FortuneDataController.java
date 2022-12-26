package fortune.be.fortunebackend.domain.fortune.controller;

import fortune.be.fortunebackend.domain.fortune.entity.FortuneData;
import fortune.be.fortunebackend.domain.fortune.service.impl.FortuneDataServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fortuneData")
@RequiredArgsConstructor
public class FortuneDataController {

    private final FortuneDataServiceImpl fortuneDataService;

    @GetMapping("/randomFortune")
    public List<FortuneData> randomFortune(){
        return fortuneDataService.randomFortune();
    }
}
