package com.ireald.wp.domain;

public class DeptAssoRoleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_role.dept_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String dept_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_role.role_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String role_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_role.dept_id
     *
     * @return the value of dept_role.dept_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getDept_id() {
        return dept_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_role.dept_id
     *
     * @param dept_id the value for dept_role.dept_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setDept_id(String dept_id) {
        this.dept_id = dept_id == null ? null : dept_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_role.role_id
     *
     * @return the value of dept_role.role_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getRole_id() {
        return role_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_role.role_id
     *
     * @param role_id the value for dept_role.role_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setRole_id(String role_id) {
        this.role_id = role_id == null ? null : role_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_role
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
        DeptAssoRoleKey other = (DeptAssoRoleKey) that;
        return (this.getDept_id() == null ? other.getDept_id() == null : this.getDept_id().equals(other.getDept_id()))
            && (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDept_id() == null) ? 0 : getDept_id().hashCode());
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        return result;
    }
}