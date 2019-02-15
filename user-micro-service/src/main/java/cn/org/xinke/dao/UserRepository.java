package cn.org.xinke.dao;

import cn.org.xinke.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @description 用户
 * @author cinco
 * @date 2019/02/14
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
