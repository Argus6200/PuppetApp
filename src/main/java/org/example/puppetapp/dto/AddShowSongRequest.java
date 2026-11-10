package org.example.puppetapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddShowSongRequest {

    private int showId;
    private int songId;
    private int order;
}
