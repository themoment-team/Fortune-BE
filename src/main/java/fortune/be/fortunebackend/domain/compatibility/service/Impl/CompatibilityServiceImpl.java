package fortune.be.fortunebackend.domain.compatibility.service.Impl;

import fortune.be.fortunebackend.domain.compatibility.dto.request.CompatibilityRequest;
import fortune.be.fortunebackend.domain.compatibility.dto.response.CompatibilityResponse;
import fortune.be.fortunebackend.domain.compatibility.entity.Compatibility;
import fortune.be.fortunebackend.domain.compatibility.repository.CompatibilityRepository;
import fortune.be.fortunebackend.domain.compatibility.service.CompatibilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompatibilityServiceImpl implements CompatibilityService {

    private final CompatibilityRepository compatibilityRepository;

    @Override
    public void saveCompatibility(CompatibilityRequest compatibilityDto) {
        Compatibility compatibility = Compatibility.builder()
                .compatibility(compatibilityDto.getCompatibility())
                .name1(compatibilityDto.getName1())
                .name2(compatibilityDto.getName2())
                .randomValue(compatibilityDto.getRandomValue())
                .build();
        compatibilityRepository.save(compatibility);
    }

    @Override
    public CompatibilityResponse findInfo(String randomValue) {
        CompatibilityResponse compatibilityResponse = compatibilityRepository.findByRandomValue(randomValue);
        return CompatibilityResponse.builder()
                .compatibility(compatibilityResponse.getCompatibility())
                .name1(compatibilityResponse.getName1())
                .name2(compatibilityResponse.getName2())
                .randomValue(compatibilityResponse.getRandomValue())
                .build();
    }
}
