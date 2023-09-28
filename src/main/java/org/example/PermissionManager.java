package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public String getRoleName(PermissionLevel permissionLevel) {
        switch (permissionLevel) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                throw new IllegalArgumentException("Invalid permission level" + permissionLevel);
        }
    }

    public void setPermissionLevel(PermissionLevel permissionLevel) {
        this.mCurrentLevel = permissionLevel;
    }

    public PermissionLevel getCurrentPermissionLevel() {
        return mCurrentLevel;
    }
}


