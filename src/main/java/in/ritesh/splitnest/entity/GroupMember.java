package in.ritesh.splitnest.entity;

import java.time.LocalDateTime;

public class GroupMember {
    private Long id;
    private String userId;
    private Long groupId;
    private LocalDateTime joinedAt;
    public GroupMember(Long id, String userId, Long groupId, LocalDateTime joinedAt) {

    }
}
