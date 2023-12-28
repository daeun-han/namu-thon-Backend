package namuton.namuwiki.domain.user.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import namuton.namuwiki.domain.darkData.domain.DarkData;
import namuton.namuwiki.domain.data.domain.Data;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String nickname;
    private String profileImg;
    private Long darkDataCnt;

    @OneToMany(mappedBy = "user")
    private List<Data> darkList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private List<DarkData> darkDataList;

}
