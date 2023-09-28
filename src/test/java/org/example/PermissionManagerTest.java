package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PermissionManagerTest {

    @Test
    public void testGetRoleName_ADMIN() {
        PermissionManager permissionManager = new PermissionManager();
        assertEquals("Admin", permissionManager.getRoleName(PermissionLevel.ADMIN));
    }

    @Test
    public void testGetRoleName_DEVELOPER() {
        PermissionManager permissionManager = new PermissionManager();
        assertEquals("Developer", permissionManager.getRoleName(PermissionLevel.DEVELOPER));
    }

    @Test
    public void testGetRoleName_USER() {
        PermissionManager permissionManager = new PermissionManager();
        assertEquals("User", permissionManager.getRoleName(PermissionLevel.USER));
    }

    @Test
    public void testGetRoleName_InvalidPermissionLevel() {
        PermissionManager permissionManager = new PermissionManager();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> permissionManager.getRoleName(PermissionLevel.UNKNOWN));
        assertEquals("Invalid permission levelUNKNOWN", exception.getMessage());
    }

    @Test
    public void testSetPermissionLevel() {
        PermissionManager permissionManager = new PermissionManager();
        permissionManager.setPermissionLevel(PermissionLevel.ADMIN);
        assertEquals(PermissionLevel.ADMIN, permissionManager.getCurrentPermissionLevel());
    }

    @Test
    public void testGetCurrentPermissionLevel() {
        PermissionManager permissionManager = new PermissionManager();
        assertEquals(PermissionLevel.USER, permissionManager.getCurrentPermissionLevel());
    }


}