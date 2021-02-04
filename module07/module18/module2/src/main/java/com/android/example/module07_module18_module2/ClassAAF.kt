package com.android.example.module07_module18_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module07_module18_module3.ClassAAI = com.android.example.module07_module18_module3.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module07_module18_module3.ClassAAA = com.android.example.module07_module18_module3.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module18_module1.ClassAAB = com.android.example.module07_module18_module1.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module07_module18_module1.ClassAAH = com.android.example.module07_module18_module1.ClassAAH()

	fun method0(
		param0: com.android.example.module07_module18_module3.ClassAAB,
		param1: com.android.example.module07_module18_module1.ClassAAJ,
		param2: com.android.example.module07_module18_module1.ClassAAE
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..5) {
				param0.method1(io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertSubscribed()

				val local_var_4_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_1.clear()

			}
		} else {
			val local_var_3_0: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
			local_var_3_0.onError(kotlin.Throwable())

		}
	}

	fun method1(
		param0: com.android.example.module07_module18_module1.ClassAAD,
		param1: com.android.example.module07_module18_module3.ClassAAE,
		param2: com.android.example.module07_module18_module3.ClassAAA
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		param0.method3(com.android.example.module07_module18_module3.ClassAAJ(), com.android.example.module07_module18_module3.ClassAAB(), com.android.example.module07_module18_module3.ClassAAH())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}
}
