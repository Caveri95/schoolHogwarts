package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hogwarts.school.model.DTO.AppInfoDTO;
import ru.hogwarts.school.service.Info;

@RestController
@RequestMapping("/appInfo")
public class InfoController {

    private final Info appInfoService;

    public InfoController(Info appInfoService) {
        this.appInfoService = appInfoService;
    }


    @GetMapping("/appInfo")
    public ResponseEntity<AppInfoDTO> getAppInfo() {
        AppInfoDTO appInfo = appInfoService.getAppInfo();
        return ResponseEntity.ok(appInfo);
    }
}
