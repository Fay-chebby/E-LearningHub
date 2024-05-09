package com.redstevo.code.Services;

import com.redstevo.code.Repositories.AuthRepository;
import com.redstevo.code.Repositories.CourseCollectionRepository;
import com.redstevo.code.Tables.AuthTable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Slf4j
@Service
@RequiredArgsConstructor
public class LearningService {

    private final CourseCollectionRepository courseCollectionRepository;

    private final AuthRepository authRepository;

    public ResponseEntity<HttpStatusCode> createCollection(
            Long userId, String collectionName, Boolean createDescriptionFile) {

        //get user details.
        AuthTable authTable = authRepository.findByUserId(userId).orElseThrow();

        //ensure the collection name is unique for the user.
        if (collectionName.
                equals(courseCollectionRepository.findCollectionNameByAuthTable(authRepository.findByUserId(userId)
                                .orElseThrow())
                        .orElseThrow())) {

        }
        return null;
    }
}