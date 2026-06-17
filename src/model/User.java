/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class User {
    private String username;
    private String password;
    private String fullName;
    private boolean isLocked; // true: Bị khóa, false: Hoạt động bình thường

    // Constructor (Hàm khởi tạo)
    public User(String username, String password, String fullName, boolean isLocked) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.isLocked = isLocked;
    }

    // Các hàm Getter và Setter để lấy và sửa dữ liệu
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public boolean isLocked() { return isLocked; }
    public void setLocked(boolean locked) { isLocked = locked; }
}
