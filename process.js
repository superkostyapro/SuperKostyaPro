const fs = require('fs');
const path = require('path');

fs.readdir('.', (err, files) => {
  files.forEach(file => {
    if (file.startsWith('phaser')) {
      let dir = path.dirname(file)
      const parts = file.split('.')
      for (let i = 2; i < parts.length - 1; i++) {
        const part = parts[i];
        dir = `${dir.toLowerCase()}/${part}`
        if (parts[i + 1] == 'module_phaser') {
          fs.copyFile(file, `${dir}.kt`, () => {});
          break;
        } else {
          if (!fs.existsSync(dir.toLowerCase())) {
            fs.mkdirSync(dir.toLowerCase());
          }
        }
      }
    }
  })
})