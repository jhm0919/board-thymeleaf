package idusw.springboot.boardthyemleaf.repository;

import idusw.springboot.boardthyemleaf.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

}
