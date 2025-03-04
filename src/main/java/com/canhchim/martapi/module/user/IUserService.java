/**
 * @Author: Duong Ngo Nam Anh
 */

package com.canhchim.martapi.module.user;

import com.canhchim.martapi.dto.UserDetailDto;
import com.canhchim.martapi.dto.UserRequestDto;
import com.canhchim.martapi.dto.UserResponseDto;
import com.canhchim.martapi.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.EntityNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface IUserService {

    /**
     * Lấy tất cả User
     * @return
     */
    List<User> findAll();

    /**
     * Xếp và lấy tất cả User
     * @param sort
     * @return
     */
    List<User> findAll(Sort sort);

    /**
     * Lấy một page User
     * @param pageable
     * @return
     */
    Page<User> findAll(Pageable pageable);

    Page<User> findAll(Pageable pageable, Sort sort);

    Page<User> findAll(String search, String searchField, Pageable pageable, Sort sort);

    /**
     * Tìm User với username
     * @param username
     * @return
     */
    User findByUsernameLike(String username) throws Exception;

    /**
     * Tìm User bằng Id
     * @param id
     * @return
     */
    User findById(Integer id);


    /**
     * Xóa User theo Id
     * @param id
     */
    void deleteById(int id) throws EntityNotFoundException;

    /**
     * Tìm UserDetailDto bằng username
     * @param username
     * @return
     */
    UserDetailDto findUserDetailByUsernameLike(String username) throws IOException;

    /**
     * Tạo User mới
     * @param userRequestDto
     * @return
     * @throws IOException
     */
    UserResponseDto create(UserRequestDto userRequestDto) throws IOException, NoSuchAlgorithmException;

    /**
     * Khóa tài khoản
     * @param username
     */
    void ban(String username);
}
