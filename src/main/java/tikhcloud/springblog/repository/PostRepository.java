package tikhcloud.springblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tikhcloud.springblog.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
