package umc2.study.umc2.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc2.study.umc2.domain.Member;
import umc2.study.umc2.domain.Terms;
import umc2.study.umc2.domain.common.BaseEntity;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberAgree extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "terms_id")
    private Terms terms;

}
