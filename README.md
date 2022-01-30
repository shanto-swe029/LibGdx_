# LibGdx

---

A Java Game Engine Codes

---


## 01: Creating fonts and drawing texts in LibGdx

* At the time of building the project, make sure that ___"Tools"___ is selected from the menu.
* Run __Heiro class__.
* Select a font from there and convert it to "--.font" file and add it to the assets folder.



## 02, 03: Handling Mouse, Keyboard & Touch Input

- It can be done in two ways
	a. By using ___Gdx.input.isKeyPressed(Input.Keys.key_name)___ as a logic parameter inside the __render()__ method
	b. By implementing __InputProcessor__ interface and _@Overddiding_ all of its methods


## 04, 05: Audio

- LibGDX supports 3 audio formats: ___ogg___, _**mp3**_ and **_wav_**.
- MP3 is a format that is mired in legal issues, while WAV is a rather large ( file size ) format, leaving OGG as often the best choice.
- Recording is also available in LibGDX.
