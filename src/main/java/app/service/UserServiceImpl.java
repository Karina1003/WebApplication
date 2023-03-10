package app.service;

import app.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserServiceImpl implements UserService{
    private Map<String,UserDto> userMap = new ConcurrentHashMap<>();

    public UserServiceImpl() {
        userMap.put("User1",new UserDto("User1","1qaz2wsx","John"));
        userMap.put("Great",new UserDto("Great","123qwe","Anna"));
        userMap.put("Sunshine",new UserDto("Sunshine","456rty","Jake"));
        userMap.put("Flower003",new UserDto("Flower003","flower1","Mary"));
        userMap.put("LittleJohn",new UserDto("LittleJohn","123asdfgqwert","Sarah"));
    }

    @Override
    public UserDto getUser(String username) {
        return userMap.get(username);
    }

    @Override
    public Map getMap() {
        return userMap;
    }
}
