package com.ireald.wp.domain;

public class RoleAssoPermisson {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permisson.role_permisson_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String role_permisson_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permisson.permisson_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String permisson_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permisson.role_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String role_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permisson.role_permisson_id
     *
     * @return the value of role_permisson.role_permisson_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getRole_permisson_id() {
        return role_permisson_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permisson.role_permisson_id
     *
     * @param role_permisson_id the value for role_permisson.role_permisson_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setRole_permisson_id(String role_permisson_id) {
        this.role_permisson_id = role_permisson_id == null ? null : role_permisson_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permisson.permisson_id
     *
     * @return the value of role_permisson.permisson_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getPermisson_id() {
        return permisson_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permisson.permisson_id
     *
     * @param permisson_id the value for role_permisson.permisson_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setPermisson_id(String permisson_id) {
        this.permisson_id = permisson_id == null ? null : permisson_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permisson.role_id
     *
     * @return the value of role_permisson.role_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getRole_id() {
        return role_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permisson.role_id
     *
     * @param role_id the value for role_permisson.role_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setRole_id(String role_id) {
        this.role_id = role_id == null ? null : role_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permisson
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
        RoleAssoPermisson other = (RoleAssoPermisson) that;
        return (this.getRole_permisson_id() == null ? other.getRole_permisson_id() == null : this.getRole_permisson_id().equals(other.getRole_permisson_id()))
            && (this.getPermisson_id() == null ? other.getPermisson_id() == null : this.getPermisson_id().equals(other.getPermisson_id()))
            && (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permisson
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRole_permisson_id() == null) ? 0 : getRole_permisson_id().hashCode());
        result = prime * result + ((getPermisson_id() == null) ? 0 : getPermisson_id().hashCode());
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        return result;
    }
}