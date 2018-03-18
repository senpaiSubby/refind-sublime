## Sublime rEFInd theme

[rEFInd](http://www.rodsbooks.com/refind/) is an easy to use boot manager for UEFI
based systems. This is a clean and minimal theme for it.

![alt text](/preview.bmp "preview")

### Usage

 1. Locate your refind EFI directory. This is commonly `/boot/EFI/refind`
    though it will depend on where you mount your ESP and where rEFInd is
    installed. `fdisk -l` and `mount` may help.

 2. Create a folder called `themes` inside it, if it doesn't already exist

 3. Clone this repository into the `themes` directory.

 4. To enable the theme add `include refind-sublime/theme.conf` at the end of
    `refind.conf`.

Here's an example menuentry configuration (from the screenshot)

```nginx
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

```

Entries that are autodetected should also show the proper icons.

