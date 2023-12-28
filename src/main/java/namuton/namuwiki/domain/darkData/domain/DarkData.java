package namuton.namuwiki.domain.darkData.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import namuton.namuwiki.domain.user.domain.User;

import java.time.LocalDateTime;

@Getter @Setter
@Entity
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class DarkData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    @JsonManagedReference
    private User user;
    private String title;
    private String content;

    @Column(name = "source_from")
    private String from;

    private LocalDateTime date;
    private boolean isDeleted;
}
