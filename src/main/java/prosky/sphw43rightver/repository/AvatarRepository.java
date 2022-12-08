package prosky.sphw43rightver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import prosky.sphw43rightver.entity.Avatar;

import java.util.Optional;

@Repository
public interface AvatarRepository extends PagingAndSortingRepository<Avatar, Long> {
    Optional<Avatar> findByStudentId(long studentId);

    void save(Avatar avatar);
}
