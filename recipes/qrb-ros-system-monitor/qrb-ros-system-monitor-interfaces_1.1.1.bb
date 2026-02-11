inherit ros_distro_${ROS_DISTRO}
inherit ros_component
inherit ros_insane_dev_so

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
inherit robotics-package

DESCRIPTION = "Type Adaption implementation on Qualcomm robotics platforms"
AUTHOR = "Peng Wang <penwang@qti.qualcomm.com>"
ROS_AUTHOR = "Peng Wang"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=86fcc2294062130b497ba0ffff9f82fc"

ROS_CN = "qrb_ros_system_monitor_interfaces"
ROS_BPN = "qrb_ros_system_monitor_interfaces"

ROS_BUILD_DEPENDS = " \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rosidl-default-runtime \
"

ROS_TEST_DEPENDS = " \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS} ${ROS_TEST_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "git://github.com/qualcomm-qrb-ros/qrb_ros_system_monitor.git;protocol=https;branch=stable/1.1.1"
SRCREV = "33adf837390c8f29b56c244e4e0394f15e88d9a2"
S = "${UNPACKDIR}/${PN}-${PV}/qrb_ros_system_monitor_interfaces"
