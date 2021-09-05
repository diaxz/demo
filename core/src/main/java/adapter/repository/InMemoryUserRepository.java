package adapter.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import entities.User;
import usecase.port.UserRepository;

public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> inMemoryDb = new HashMap<>();

    @Override
    public Optional<User> findByEmail(String email) {
        return inMemoryDb.values().stream()
                .filter(user -> user.getEmail().equals(email))
                .findAny();
    }

    @Override
    public User createUser(User user) {
        return inMemoryDb.put(user.getId(), user);
    }

}
