package com.project.Project.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.Project.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private ObjectMapper mapper;

    public UserService(UserRepository userRepository, ObjectMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

//TODO: NEEDS FIXING
//    public User saveUser(User user) {
//        if (user.getUserId() == null ){
//            UserEO eo = mapper.convertValue(user, UserEO.class);
//            User result = mapper.convertValue(userRepository.save(eo), User.class);
//            return result;
//        } else {
//            Optional<UserEO> user = userRepository.findById(user.getUserId());
//            if (user.isPresent()) {
//                UserEO eo = user.get();
//                eo.setUserId(user.getUserId());
//                eo.setFirstName(user.getFirstName());
//                eo.setLastName(user.getLastName());
//                eo.setPhoneNumber(user.getPhoneNumber());//
//                eo = userRepository.save(eo);
//                return mapper.convertValue(eo, User.class);
//            } else {
//                UserEO eo = mapper.convertValue(user, UserEO.class);
//                Address result = mapper.convertValue(userRepository.save(eo), User.class);
//                return result;
//            }
//        }
//    }

}