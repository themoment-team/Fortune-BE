package fortune.be.fortunebackend.compatibility.controller;

import fortune.be.fortunebackend.compatibility.dto.CompatibilityDto;
import fortune.be.fortunebackend.compatibility.entity.Compatibility;
import fortune.be.fortunebackend.compatibility.service.CompatibilityService;
import fortune.be.fortunebackend.fortune.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/compatibility")
public class CompatibilityController {
    @Autowired
    private final CompatibilityService compatibilityService;

    public CompatibilityController(CompatibilityService compatibilityService) {
        this.compatibilityService = compatibilityService;
    }

    @GetMapping("/save")
    public ResponseDto save(@RequestBody CompatibilityDto compatibility){
        compatibilityService.saveCompatibility(compatibility);
        return new ResponseDto<>(HttpStatus.OK.value());
    }

    @PostMapping("/info")
    public Optional<Compatibility> memberInfo(@RequestBody CompatibilityDto compatibility){
        return compatibilityService.findInfo(compatibility);
    }
}
