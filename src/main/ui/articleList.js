import React, {Component} from 'react'
import Article from './article'

export default class ArticleList extends React.Component{
	render() {
		const articles = this.props.articles.map(article =>
			<Article key={article.id} article={article}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Title</th>
						<th>Summary</th>
					</tr>
					{articles}
				</tbody>
			</table>
		)
	}
}