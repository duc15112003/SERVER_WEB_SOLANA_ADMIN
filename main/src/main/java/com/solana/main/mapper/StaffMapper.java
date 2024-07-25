package com.solana.main.mapper;

import com.solana.main.dto.StaffDTO;
import com.solana.main.model.Staff;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StaffMapper {
    StaffMapper INSTANCE = Mappers.getMapper( StaffMapper.class );

    StaffDTO StaffToStaffDTO(Staff Staff);
    Staff StaffDTOToStaff(StaffDTO StaffDto);
    List<Staff> listStaffDTOToListStaff(List<StaffDTO> listStaffDTO);
    List<StaffDTO> listStaffToListStaffDTO(List<Staff> listStaff);
}
