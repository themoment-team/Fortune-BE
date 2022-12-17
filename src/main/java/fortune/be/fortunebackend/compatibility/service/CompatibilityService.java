package fortune.be.fortunebackend.compatibility.service;

import fortune.be.fortunebackend.compatibility.dto.CompatibilityDto;
import fortune.be.fortunebackend.compatibility.entity.Compatibility;
import fortune.be.fortunebackend.compatibility.repository.CompatibilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompatibilityService {
    @Autowired
    private final CompatibilityRepository compatibilityRepository;

    public CompatibilityService(CompatibilityRepository compatibilityRepository) {
        this.compatibilityRepository = compatibilityRepository;
    }

    public Compatibility saveCompatibility (CompatibilityDto reqcompatibility){
        Compatibility compatibility = reqcompatibility.CompatibilityEntity();
        return compatibilityRepository.save(compatibility);
    }

    public Compatibility findInfo(CompatibilityDto compatibility){
         Compatibility info = compatibilityRepository.findByRandomValue(compatibility.getRandomValue()).orElseThrow(() -> {
             return new IllegalArgumentException("정보 찾기 실패");
         });
        System.out.println(compatibility.getRandomValue());

        return info;
    }
}
