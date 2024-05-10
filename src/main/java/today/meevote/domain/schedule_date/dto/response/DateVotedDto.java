package today.meevote.domain.schedule_date.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DateVotedDto {
    private long dateVotedId;
    private String startDate;
    private String endDate;
}