package com.ireald.wp.domain;

import java.util.List;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String role_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.name
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.description
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.is_show
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private Boolean is_show;
    
    private List<Premission> premissions;

    public List<Premission> getPremissions() {
		return premissions;
	}

	public void setPremissions(List<Premission> premissions) {
		this.premissions = premissions;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role_id
     *
     * @return the value of role.role_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getRole_id() {
        return role_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role_id
     *
     * @param role_id the value for role.role_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setRole_id(String role_id) {
        this.role_id = role_id == null ? null : role_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role
     *
     * @return the value of role.role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role
     *
     * @param role the value for role.role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.name
     *
     * @return the value of role.name
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.name
     *
     * @param name the value for role.name
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.description
     *
     * @return the value of role.description
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.description
     *
     * @param description the value for role.description
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.is_show
     *
     * @return the value of role.is_show
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public Boolean getIs_show() {
        return is_show;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.is_show
     *
     * @param is_show the value for role.is_show
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setIs_show(Boolean is_show) {
        this.is_show = is_show;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Role other = (Role) that;
        return (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getIs_show() == null ? other.getIs_show() == null : this.getIs_show().equals(other.getIs_show()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getIs_show() == null) ? 0 : getIs_show().hashCode());
        return result;
    }
}