package fortune.be.fortunebackend.fortune.controller;

import fortune.be.fortunebackend.fortune.dto.FortuneDataDto;
import fortune.be.fortunebackend.fortune.dto.ResponseDto;
import fortune.be.fortunebackend.fortune.entity.FortuneData;
import fortune.be.fortunebackend.fortune.service.FortuneDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fortuneData")
public class FortuneDataController {

    @Autowired
    private final FortuneDataService fortuneDataService;

    public FortuneDataController(FortuneDataService fortuneDataService) {
        this.fortuneDataService = fortuneDataService;
    }

    @GetMapping("/save")
    public ResponseDto saveFortuneData(@RequestBody FortuneDataDto fortuneData){
        fortuneDataService.save(fortuneData);
        return new ResponseDto<>(HttpStatus.OK.value());
    }

    @GetMapping("/randomFortune")
    public List<FortuneData> randomFortune(){
        return fortuneDataService.randomFortune();
    }
}
