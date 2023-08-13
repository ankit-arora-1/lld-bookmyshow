package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel {

    @ManyToOne
    private Show show;
    @ManyToOne
    private SeatType seatType;
    private int price;
}

show_id seatype_id
1         gold
1         silver
2         gold
2         silver
