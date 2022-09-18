package com.xzz.day01;

/**
 * @author 徐正洲
 * @date 2022/5/1-20:12
 */
public class PermissionModifierTest {
    public static void main(String[] args) {
        PermissionModifier permissionModifier = new PermissionModifier();
        permissionModifier.sfz=1;
        permissionModifier.phone=2;

        permissionModifier.method2();
        permissionModifier.method3();

    }
}