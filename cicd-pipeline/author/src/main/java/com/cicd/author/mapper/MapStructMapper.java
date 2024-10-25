package com.cicd.author.mapper;

import com.cicd.author.dto.AuthorAll;
import com.cicd.author.dto.AuthorDto;
import com.cicd.author.entity.AuthEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * packageName : com.cicd.author.mapper
 * fileName    : MapStructMapper
 * author      : jaejun
 * date        : 2024-10-25
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-25         jaejun
 */

@Mapper(
        componentModel = "spring"
)
public interface MapStructMapper {

    AuthorDto auhtorToAuthorDto (
      AuthEntity author
    );

    AuthorAll authorToAuthorAll (
        AuthEntity author
    );

    List<AuthorAll> authorsToAuthorAllList (
        List<AuthEntity> authors
    );
}
