package com.android.example.module06_module284_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.schedulers.IoScheduler = io.reactivex.internal.schedulers.IoScheduler()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.schedulers.SingleScheduler
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..5) {
				for (iAc in 0..1) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.dispose()

					local_var_5_0.onNext(kotlin.Any())

					val local_var_5_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_1.onError(kotlin.Throwable())

				}
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertNotSubscribed()

			}
		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.util.LinkedArrayList,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.internal.schedulers.ComputationScheduler = io.reactivex.internal.schedulers.ComputationScheduler()
		local_var_2_5.start()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.isCancelled()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.requestMore(5242323416749600212)

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(22)
		local_var_2_1.add(kotlin.Any())

		param0.isCancelled()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}

	fun method4(
		param0: io.reactivex.schedulers.TestScheduler,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(-825124054244255945)

		val local_var_2_5: io.reactivex.internal.util.OpenHashSet<kotlin.Any> = io.reactivex.internal.util.OpenHashSet()
		local_var_2_5.add(kotlin.Any())

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.assertSubscribed()

	}
}
