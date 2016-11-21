const gulp = require('gulp');
const jasmine = require('gulp-jasmine');
const jasmine_live = require('gulp-jasmine-livereload-task');
const watch = require('gulp-watch');

gulp.task('default', function() {
    return gulp.src('src/test/javascript/**/*.js')
        .pipe(jasmine())
});

gulp.task('jasmine', jasmine_live({
    files: ['src/main/resources/**/*.js', 'src/test/javascript/**/*.js']
}));