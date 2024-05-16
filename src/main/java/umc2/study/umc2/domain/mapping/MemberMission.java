package umc2.study.umc2.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc2.study.umc2.domain.Member;
import umc2.study.umc2.domain.Mission;
import umc2.study.umc2.domain.common.BaseEntity;
import umc2.study.umc2.domain.enums.MissionStatus;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,length = 15)
    private MissionStatus status;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Mission mission;
}
