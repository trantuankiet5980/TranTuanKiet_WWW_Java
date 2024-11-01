package vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.repositories.mapper;

import org.springframework.jdbc.core.RowMapper;
import vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.entities.Skill;

import java.sql.ResultSet;
import java.sql.SQLException;


public class SkillMapper implements RowMapper<Skill> {
    @Override
    public Skill mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Skill.builder()
                .id(rs.getInt("id"))
                .skillName(rs.getString("skill_name"))
                .field(rs.getString("field"))
                .description(rs.getString("description"))
                .build();
    }
}
