package fortune.be.fortunebackend.fortune.controller;

import fortune.be.fortunebackend.fortune.dto.FortuneDto;
import fortune.be.fortunebackend.fortune.dto.ResponseDto;
import fortune.be.fortunebackend.fortune.entity.Fortune;
import fortune.be.fortunebackend.fortune.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fortune")
public class FortuneController {

    @Autowired
    private final FortuneService fortuneService;

    public FortuneController(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @GetMapping("/save")
    public ResponseDto save(@RequestBody FortuneDto fortune){
        fortuneService.saveFortune(fortune);
        return new ResponseDto<>(HttpStatus.OK.value());
    }

    @PostMapping("/info")
    public Fortune memberInfo(@RequestBody FortuneDto member){
        return fortuneService.findInfo(member);
    }
}
