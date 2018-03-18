menuentry "Arch" {
  icon /EFI/refind/sublime/icons/os_arch.png
  volume Arch
  ostype Linux
  loader /vmlinuz-linux-zen
  initrd /initramfs-linux-zen.img
  options "root=/dev/sdb3 rw initrd=/intel-ucode.img quiet loglevel=3 udev.log-priority=3"
}

menuentry "Windows 10" {
	icon /boot/EFI/refind/sublime/icons/os_win.png
	loader /EFI/Microsoft/Boot/bootmgfw.efi
	disabled
}

