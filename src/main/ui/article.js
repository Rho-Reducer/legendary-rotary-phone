const React = require('react');

export default class Article extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.article.title}</td>
				<td>{this.props.article.summary}</td>
				<td>{this.props.article.content}</td>
			</tr>
		)
	}
}