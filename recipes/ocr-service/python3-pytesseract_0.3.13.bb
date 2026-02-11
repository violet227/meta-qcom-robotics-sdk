SUMMARY = "Python-tesseract is a python wrapper for Google's Tesseract-OCR"
HOMEPAGE = "https://github.com/madmaze/pytesseract"
AUTHOR = "Samuel Hoffstaetter <samuel@hoffstaetter.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://files.pythonhosted.org/packages/9f/a6/7d679b83c285974a7cb94d739b461fa7e7a9b17a3abfd7bf6cbc5c2394b0/pytesseract-0.3.13.tar.gz"

SRC_URI[md5sum] = "73f9645e59b437f064d05882b95832ce"
SRC_URI[sha256sum] = "4bf5f880c99406f52a3cfc2633e42d9dc67615e69d8a509d74867d3baddb5db9"
S = "${UNPACKDIR}/pytesseract-0.3.13"
RDEPENDS:${PN} = " python3-packaging python3-pillow "
inherit setuptools3
