package com.example.miniprojet.entities;

public enum RoleName {

    ADMIN("ADMIN"),
    CLIENT("CLIENT"),
    COOPERATIVE("COOPERATIVE");

    private String role = "";

    RoleName(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "RoleName{" +
                "role='" + role + '\'' +
                '}';
    }
}
