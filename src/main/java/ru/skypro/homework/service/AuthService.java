package ru.skypro.homework.service;


import ru.skypro.homework.dto.RegisterReqDto;

public interface AuthService {
    boolean login(String userName, String password);
    <role> boolean register(RegisterReqDto registerReqDto);
}
