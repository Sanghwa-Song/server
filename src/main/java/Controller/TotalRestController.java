package Controller;

import Class.*;
import Dto.PersonalDto;
import Repository.PersonalRepository;
import Service.PersonalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TotalRestController {

    private final PersonalRepository personalRepository;

    private final PersonalService personalService;

    @GetMapping("/personal")
    public List<Personal> getPersonal() {
        return personalRepository.findAll();
    }

    @PostMapping("/personal")
    public Personal createPersonal(@RequestBody PersonalDto personalDto) {
        Personal personal = new Personal(personalDto);
        return personalRepository.save(personal);
    }

    @PutMapping("/personal/{mem_num}")
    public Long updatePersonal(@PathVariable Long mem_num, @RequestBody PersonalDto personalDto) {
        return personalService.update(mem_num, personalDto);
    }

    @DeleteMapping("/personal/{mem_num}")
    public Long deletePersonal(@PathVariable Long mem_num) {
        personalRepository.deleteById(mem_num);
        return mem_num;
    }
}
