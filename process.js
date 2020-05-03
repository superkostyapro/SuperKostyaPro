const fs = require('fs');
const path = require('path');
const process = require('process');

String.prototype.replaceBetween = function(start, end, what) {
  return this.substring(0, start) + what + this.substring(end);
};

process.chdir('src/Phaser');

fs.readdir('.', (err, files) => {
  files.forEach(file => {
    if (file.startsWith('phaser')) {
      let dir = path.dirname(file);
      const parts = file.split('.');
      for (let i = 2; i < parts.length - 2; i++) {
        const part = parts[i];
        dir = `${dir}/${part}`;
        if (!fs.existsSync(dir)) {
          fs.mkdirSync(dir);
        }
        if (i === parts.length - 3) {
          fs.copyFileSync(file, `${dir}/${part}.kt`);
          fs.unlinkSync(file);
        }
      }
    }
  })
})